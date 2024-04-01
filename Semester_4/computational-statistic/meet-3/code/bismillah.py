import numpy as np

num = [21, 20, 17, 31, 24, 15, 21, 24, 18, 33, 8, 11, 26, 27, 29, 24, 14, 29, 41, 15, 17, 13, 28, 22, 16, 12, 15, 11, 16, 18, 29, 16, 24, 21, 19, 7, 16, 12, 45, 24, 21, 12, 10, 13, 20, 35, 32, 22, 12, 10
]

# sorted number
sortedNum = sorted(num)
print("Number: ", sortedNum)

#mean
mean = np.mean(sortedNum)

#median
median = np.median(sortedNum)

#mode
mode = max(set(sortedNum), key=sortedNum.count)

#range
range = max(sortedNum) - min(sortedNum)

#variance
variance = np.var(sortedNum)

#standard deviation
stdDev = np.std(sortedNum)

#IQR
Q1 = np.percentile(sortedNum, 25)
Q2 = np.percentile(sortedNum, 50)
Q3 = np.percentile(sortedNum, 75)
IQR = Q3 - Q1

#range
range = max(sortedNum) - min(sortedNum)

#shifting
shifted = [i + 2 for i in sortedNum]

#scale
scaled = [i * 2 for i in sortedNum]

#boxplot

print("Mean: ", mean)
print("Median: ", median)
print("Mode: ", mode)
print("Range: ", range)
print("Variance: ", variance)
print("Standard Deviation: ", stdDev)
print("Q1: ", Q1)
print("Q2: ", Q2)
print("Q3: ", Q3)
print("IQR: ", IQR)
print("Range: ", range)
print("Shifted: ", shifted)
print("Scaled: ", scaled)