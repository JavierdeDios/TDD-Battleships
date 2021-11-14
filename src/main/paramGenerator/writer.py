def generatePairWise():
    with open('outputs_txt/pairwise.txt', 'w') as f:
        with open('inputs_txt/length2.txt', 'r') as l2:
            length2 = l2.readlines()
            del length2[0]
            for linia in length2:
                linia = linia.replace('\n', '')
                splittedText = linia.split('\t')
                f.write("arguments("+str(splittedText[0])+", "+str(splittedText[1])+", '"+str(splittedText[2])+"', 2, "+str(splittedText[3])+"), ")
        l2.close()

        with open('inputs_txt/length3.txt', 'r') as l3:
            length3 = l3.readlines()
            del length3[0]
            for linia in length3:
                linia = linia.replace('\n', '')
                splittedText = linia.split('\t')
                f.write("arguments("+str(splittedText[0])+", "+str(splittedText[1])+", '"+str(splittedText[2])+"', 3, "+str(splittedText[3])+"), ")
        l3.close()

        with open('inputs_txt/length4.txt', 'r') as l4:
            length4 = l4.readlines()
            del length4[0]
            for linia in length4:
                linia = linia.replace('\n', '')
                splittedText = linia.split('\t')
                f.write("arguments("+str(splittedText[0])+", "+str(splittedText[1])+", '"+str(splittedText[2])+"', 4, "+str(splittedText[3])+"), ")
        l4.close()

        with open('inputs_txt/length5.txt', 'r') as l5:
            length5 = l5.readlines()
            del length5[0]
            for linia in length5:
                linia = linia.replace('\n', '')
                splittedText = linia.split('\t')
                f.write("arguments("+str(splittedText[0])+", "+str(splittedText[1])+", '"+str(splittedText[2])+"', 5, "+str(splittedText[3])+"), ")
        l5.close()
    f.close()

def generateBoundaries():
    with open('outputs_txt/boundaries.txt', 'w') as bf:
        for i in range(0, 10):
            for length in range(2, 6):
                calcul = 11 - length
                calcul2 = 10 - length
                bf.write("arguments(" + str(i) + ", " + str(calcul) + ", 'h', " + str(length) + ", " + str(length + calcul <= 10).lower() + "), ")
                bf.write("arguments(" + str(i) + ", " + str(calcul2) + ", 'h', " + str(length) + ", " + str(length + calcul2 <= 10).lower() + "), ")
                bf.write("arguments(" + str(calcul) + ", " + str(i) + ", 'v', " + str(length) + ", " + str(length + calcul <= 10).lower() + "), ")
                bf.write("arguments(" + str(calcul2) + ", " + str(i) + ", 'v', " + str(length) + ", " + str(length + calcul2 <= 10).lower() + "), ")
    bf.close()

def generateHV():
    with open('outputs_txt/placeH.txt', 'w') as pH:
        for i in range(0, 10):
            for length in range(2, 6):
                pH.write("arguments(0, " + str(i) + ", " + str(length) + ", " + str(length + i <= 10).lower() + "), ")
    pH.close()

    with open('outputs_txt/placeV.txt', 'w') as pV:
        for i in range(0, 10):
            for length in range(2, 6):
                pV.write("arguments(" + str(i) + ", 0, " + str(length) + ", " + str(length + i <= 10).lower() + "), ")
    pV.close()

def generateCollisions():
    with open('outputs_txt/collisions.txt', 'w') as coll:
        for i in range(0, 10):
            coll.write("arguments(" + str(i) + ", 0, 'h', 5, " + str(i < 4).lower() + "), ")
            coll.write("arguments(" + str(i) + ", 5, 'h', 5, " + str(i > 5).lower() + "), ")
            coll.write("arguments(" + str(i) + ", 0, 'h', 4, " + str(i != 4).lower() + "), ")
            coll.write("arguments(" + str(i) + ", 1, 'h', 4, " + str(i < 4).lower() + "), ")
            coll.write("arguments(" + str(i) + ", 6, 'h', 4, " + str(i != 5).lower() + "), ")
            coll.write("arguments(" + str(i) + ", 5, 'h', 4, " + str(i > 5).lower() + "), ")

            coll.write("arguments(0, " + str(i) + ", 'v', 5, " + str(i > 5).lower() + "), ")
            coll.write("arguments(5, " + str(i) + ", 'v', 5, " + str(i < 4).lower() + "), ")
            coll.write("arguments(0, " + str(i) + ", 'v', 4, " + str(i != 5).lower() + "), ")
            coll.write("arguments(1, " + str(i) + ", 'v', 4, " + str(i > 5).lower() + "), ")
            coll.write("arguments(6, " + str(i) + ", 'v', 4, " + str(i != 4).lower() + "), ")
            coll.write("arguments(5, " + str(i) + ", 'v', 4, " + str(i < 4).lower() + "), ")
    coll.close()

def generateSunk():
    with open('outputs_txt/sunk.txt', 'w') as sunk:
        for i in range(2, 6):
            sunk.write("arguments(0, 0, 'h', " + str(i) + "), ")
            sunk.write("arguments(9, 0, 'h', " + str(i) + "), ")
            sunk.write("arguments(0, " + str(10 - i) + ", 'h', " + str(i) + "), ")
            sunk.write("arguments(9, " + str(10 - i) + ", 'h', " + str(i) + "), ")

            sunk.write("arguments(0, 0, 'v', " + str(i) + "), ")
            sunk.write("arguments(0, 9, 'v', " + str(i) + "), ")
            sunk.write("arguments(" + str(10 - i) + ", 0, 'v', " + str(i) + "), ")
            sunk.write("arguments(" + str(10 - i) + ", 9, 'v', " + str(i) + "), ")
    sunk.close()

def generateMockPositions():
    with open('outputs_txt/randomMockPositions.txt', 'w') as rp:
        for i in range(0, 10):
            for j in range(0, 10):
                rp.write("arguments(" + str(i) + ", " + str(j) + ", 'h'), ")
                rp.write("arguments(" + str(i) + ", " + str(j) + ", 'v'), ")
    rp.close()

generateMockPositions()
generateSunk()
generateCollisions()
generateBoundaries()
generateHV()
generatePairWise()