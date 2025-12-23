package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _13_멜론베스트앨범 {
    public static void main(String[] args) {
        System.out.print("정답 = [4, 1, 3, 0] / 현재 풀이 값 = ");
        System.out.println(getMelonBestAlbum(
                    new String[]{"classic", "pop", "classic", "classic", "pop"}, 
                    new int[]{500, 600, 150, 800, 2500}));
       
        System.out.println();

        System.out.print("정답 = [0, 6, 5, 2, 4, 1] / 현재 풀이 값 = ");
        System.out.println(getMelonBestAlbum(
                    new String[]{"hiphop", "classic", "pop", "classic", "classic", "pop", "hiphop"}, 
                    new int[]{2000, 500, 600, 150, 800, 2500, 2000}));
    }
    
    public static List<Integer> getMelonBestAlbum(String[] genreArray, int[] playArray) {
        int n = genreArray.length;
        Map<String, Integer> genreTotalPlayDict = new HashMap<>();
        Map<String, List<int[]>> genreIndexPlayArrayDict = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String genre = genreArray[i]; // ex) classic
            int play = playArray[i]; // ex) 500
            
            if (genreTotalPlayDict.containsKey(genre)) { 
                genreTotalPlayDict.put(genre, genreTotalPlayDict.get(genre) + play); 
                genreIndexPlayArrayDict.get(genre).add(new int[]{i, play});
            } else { 
                genreTotalPlayDict.put(genre, play); 
                List<int[]> list = new ArrayList<>();
                list.add(new int[]{i, play});
                genreIndexPlayArrayDict.put(genre, list);
            }
        }
        
        List<Map.Entry<String, Integer>> sortedGenrePlayList = new ArrayList<>(genreTotalPlayDict.entrySet());
        sortedGenrePlayList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sortedGenrePlayList) {
            String genre = entry.getKey();
            List<int[]> genreIndexPlayList = genreIndexPlayArrayDict.get(genre);
            
            // Sort by play count (descending), then by index (ascending) if play counts are equal
            genreIndexPlayList.sort((a, b) -> {
                if (b[1] != a[1]) {
                    return b[1] - a[1]; // Sort by play count descending
                } else {
                    return a[0] - b[0]; // Sort by index ascending
                }
            });
            
            int genreSongCount = 0;
            for (int[] indexPlay : genreIndexPlayList) {
                if (genreSongCount >= 2) {
                    break;
                }
                
                result.add(indexPlay[0]);
                genreSongCount++;
            }
        }
        
        return result;
    }
}
