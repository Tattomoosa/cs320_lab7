class AddExp extends Exp {
  private Exp left;
  private Exp right;
  AddExp (Exp left, Exp right) {this.left = left; this.right = right;}

  int eval(Env<Integer> env) throws Env.UndefinedId {
    return left.eval(env) + right.eval(env);
  }
}

