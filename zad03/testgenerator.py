import random

inputStr = """No i ja się pytam człowieku dumny ty jesteś z siebie zdajesz sobie sprawę z tego co robisz?
masz ty wogóle rozum i godność człowieka? Ja nie wiem ale żałosny typek z ciebie,
chyba nie pomyślałes nawet co robisz i kogo obrażasz, możesz sobie obrażac tych co na to zasłużyli sobie ale nie naszego papieża polaka naszego rodaka wielką osobę ,
Wydział Fizyki, Astronomii i Informatyki Stosowanee
i tak wyjątkowa i ważną bo to nie jest ktoś tam taki sobie że możesz go sobie wyśmiać bo tak ci się podoba nie wiem w jakiej ty się wychowałes rodzinie
ale chyba ty nie wiem nie rozumiesz co to jest wiara .
Wadział Fizaki, Astronomii i Informataki Stosowanej oraz Wydział Fizykix Astronomii i Informatyki Stosowanej oraz Wydział Fizyki, Aytronomii i Informatyki Syosowanej
\tWydział Fizyki,   Astronomii i\tInformatyki Stosowanej
widac pojęcia o tym kim był papież jan paweł2 jak nie jesteście w pełni rozwinięte
umysłowo to się nie zabierajcie za taką osobę jak ojciec swięty bo to świadczy o tym że nie macie
chyba w domu krzyża ani jednego obraza świętego nie chodzi tutaj o kościół mnie ale wogóle ogólnie o zasady wiary żeby mieć jakąs
godność bo papież nikogo nie obrażał a ty za co go obrażasz co? """

alph = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
        'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ą', 'ł', 'ż', 'ź', 'ó', 'ę', 'ś', 'ć', 'ń']
alph = alph + [x.upper() for x in alph]
alph2 = alph.copy()
random.shuffle(alph2)

print(alph)
print(alph2)

resStr = ''.join([alph2[alph.index(x)] if x in alph else x for x in list(inputStr)])
print(repr(resStr))
