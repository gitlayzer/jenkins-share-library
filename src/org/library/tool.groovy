package org.library

def PrintMes(value, color) {
    colors = [
        'red': "033[40;31m >>>>>>>>>>>${value}cc<ccc<<<ee \033[0m",
        'green' : "[1;32m>>>>>>>>>>${value}>>>>>>>>>>[m",
    ]
    ansiColor('xterm') {
        println(colors[color])
    }
}
