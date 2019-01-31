具体的な実装を切り替えるようにするパターン．

制約によって，
- log(nV) dp[value] = weight
- log(nW) dp[weight] = value
- log(n^2)

を切り替える感じ．