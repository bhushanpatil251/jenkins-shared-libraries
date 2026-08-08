def call(String url, String branch) {
  echo "this is code cloning"
  git url: "${url}", branch: "${branch}"
}
