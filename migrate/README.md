# DB マイグレーション

Prisma を用いて行う

基本以下を参照、差分を記載する

https://zenn.dev/thirosue/books/49a4ee418743ed

## 必要なもの

- node.js

## セットアップ

```bash
npm i
```

## データセットアップ

```bash
npx prisma migrate dev --name init
```
