class Solution:
    def numTilePossibilities(self, tiles: str) -> int:
        import itertools
        s=set()
        for i in range(1,len(tiles)+1):
            s.update(itertools.permutations(tiles,i))
        return len(s)
        
