class DivExp extends Exp {
  private Exp left;
  private Exp right;
  DivExp (Exp left, Exp right) {this.left = left; this.right = right;}

  void emit(Env<Integer> env, int depth) throws Env.UndefinedId {
      left.emit(env, depth);
      right.emit(env, ++depth);
      System.out.println("DIV");
  }
}

