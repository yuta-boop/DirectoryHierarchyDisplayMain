# DirectoryHierarchyDisplayMain
# DirectoryHierarchyDisplayMain

このJavaプログラムは、ディレクトリ構造を階層的に表示するツールです。

## 特徴
- `SimpleFileVisitor` を継承し、ディレクトリとファイルをインデント付きで表示
- `Files.walkFileTree()` でファイル探索

## 使用方法
1. Java 17以上をインストール
2. `PrintFileVisitor2` を `src/` ディレクトリに置く
3. メインメソッドで `Files.walkFileTree()` を呼び出す（例は省略）

## サンプル出力
