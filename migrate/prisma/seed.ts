import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

async function main() {
    const alice = await prisma.account.create({
        data: {
            name: 'Alice',
            email: 'alice@example.com',
        }
    })

    const bob = await prisma.account.create({
        data: {
            name: 'Bob',
            email: 'bob@example.com',
        }
    })

    const john = await prisma.account.create({
        data: {
            name: 'John',
            email: 'john@example.com',
        }
    })

    console.log({alice, bob, john})
}

main()
    .catch(e => {
        console.error(e)
        process.exit(1)
    })
    .finally(async () => {
        await prisma.$disconnect()
    })