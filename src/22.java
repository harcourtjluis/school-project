import java.util.Scanner;

public class CodeCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("请输入要生成的代码段落: ");
        String codeSegment = scanner.nextLine();
        
        // 用于记录已输入的代码片段
        StringBuilder codeBuilder = new StringBuilder();
        int currentIndex = 0;
        
        while (currentIndex < codeSegment.length()) {
            char currentChar = codeSegment.charAt(currentIndex);
            if (currentChar == ' ') {
                codeBuilder.append(codeBuilder.toString());
                codeBuilder.setLength(0); // 清空StringBuilder
            } else {
                codeBuilder.append(currentChar);
            }
            
            currentIndex++;
        }
        
        System.out.println("已生成的代码段落: " + codeBuilder.toString());
    }
}
