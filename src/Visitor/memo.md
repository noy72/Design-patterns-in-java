データ構造が保存している要素に特定の処理を行うパターン

データは受理するメソッド，Visitorは訪れるメソッドを持つ．

data.accept(visitor) -> 
visitor.visit(data) ->
data.accept(visitor) -> ...

visitで次の要素のacceptを呼び出して，acceptはvisitを呼び出す．

