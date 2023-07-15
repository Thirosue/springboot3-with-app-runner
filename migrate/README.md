# DBマイグレーション

Prismaを用いて行う

基本以下を参照、差分を記載する

https://zenn.dev/thirosue/books/49a4ee418743ed

## 必要なもの

* node.js

## セットアップ

```bash
npm init -y
npm i -D prisma @prisma/client typescript ts-node @types/node
```

## データセットアップ

```bash
npx prisma migrate dev --name init
```