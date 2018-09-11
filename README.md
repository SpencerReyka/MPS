# MPS
# MIPS Pipeline Simulator 
Program that simulates the MIPS Pipeline data path (ID -> IF -> EX -> MEM -> WB) with 4 bit branch prediction, hazard control, and data forewarding.

Trying to simulate each significant component with objects, and verify the implementation through JUnit unit tests, and simulate the pipeline through integration tests 

# Instructions 

Each instruction is represented by a common Instruction object, so if a certain instruction doesn't use certain fields (shamt for I- and J-types, or immediate for R-types), it is up to the individual component to figure that out. 

![Instruction Decode](https://i.imgur.com/Wc5iPNN.png)


# Registers

MIPS assembly language employs a convention for use of registers. This convention is not enforced by the assembler or the hardware, but it must be followed by all MIPS assembly language programmers in order to avoid unexpected behavior of modules written by different people.

![Register Convention](https://i.imgur.com/ItzI6uJ.png)

# Reseting Commit History 
To reset the commit history username or user email, check https://help.github.com/articles/changing-author-info/ 
Make sure to set the correct user name after for future commits.

# Editing .Gitignore 
https://stackoverflow.com/questions/18418718/git-still-adds-and-tracks-folders-marked-in-gitignore
