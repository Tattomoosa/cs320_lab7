class LetExp extends Exp {
  private String x;
  private Exp d;
  private Exp e;
  LetExp(String x, Exp d, Exp e) {this.x = x; this.d = d; this.e = e;}

  void emit(Env<Integer> env, int depth) throws Env.UndefinedId {
      d.emit(env, depth);
      e.emit(env.extend(x, ++depth), depth);
      System.out.printf("SWAP 1\nPOP\n");
  }
}

