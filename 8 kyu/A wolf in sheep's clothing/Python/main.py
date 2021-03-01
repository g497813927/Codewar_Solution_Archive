def warn_the_sheep(queue):
    wolf_index = 0
    for index in queue:
        if index == 'wolf':
            break
        wolf_index += 1
    if wolf_index == len(queue) - 1:
        return 'Pls go away and stop eating my sheep'
    return f'Oi! Sheep number {len(queue) - wolf_index - 1}! You are about to be eaten by a wolf!'
