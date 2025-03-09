public static String generateRandomJavaCode() {
  Random rand = new Random();
  StringBuilder sb = new StringBuilder();
  int numClasses = rand.nextInt(5) + 1;
  for (int i = 0; i < numClasses; i++) {
    sb.append("class ");
    sb.append(rand.nextInt(100));
    sb.append(" {\n");
    int numMethods = rand.nextInt(5) + 1;
    for (int j = 0; j < numMethods; j++) {
      sb.append("  public ");
      sb.append(rand.nextBoolean() ? "void" : "String");
      sb.append(" ");
      sb.append(rand.nextInt(100));
      sb.append("() {\n");
      int numStatements = rand.nextInt(5) + 1;
      for (int k = 0; k < numStatements; k++) {
        sb.append("    ");
        sb.append(rand.nextBoolean() ? "System.out.println" : "return");
        sb.append(" \"");
        sb.append(UUID.randomUUID().toString());
        sb.append("\";\n");
      }
      sb.append("  }\n");
    }
    sb.append("}\n");
  }
  return sb.toString();
}
