"""Read complete SQLite DDL literals from smali, including quoted identifiers."""
import re

DDL = re.compile(
    rb'const-string(?:/jumbo)? [vp]\d+, "(CREATE (?:VIRTUAL )?(?:TABLE|INDEX|UNIQUE INDEX) (?:[^"\\\n]|\\.)*)"',
    re.IGNORECASE,
)
ESCAPE = re.compile(r"\\(u[0-9a-fA-F]{4}|.)")
CHARS = {"n": "\n", "t": "\t", "r": "\r", "b": "\b", "f": "\f", "\\": "\\", '"': '"', "'": "'"}

def decode_literal(raw):
    def decode(match):
        code = match.group(1)
        return chr(int(code[1:], 16)) if code.startswith("u") and len(code) == 5 else CHARS.get(code, match.group())
    return ESCAPE.sub(decode, raw.decode())

def statements(data):
    # A constant-only chain is common in Agoo database helpers. Stop at every
    # intervening instruction so a runtime variable can never become fake SQL.
    pair = re.compile(rb'const-string(?:/jumbo)? ([vp]\d+), "((?:[^"\\\n]|\\.)*)"\s*\n(?:\s*\.line [0-9]+\s*\n)*\s*invoke-virtual \{([vp]\d+), \1\}, Ljava/lang/String(?:Builder|Buffer);->append\(Ljava/lang/String;\)Ljava/lang/String(?:Builder|Buffer);')
    for match in DDL.finditer(data):
        initial = decode_literal(match[1])
        first = pair.match(data, match.start())
        if first is None or initial.rstrip().endswith((';', ')')):
            yield initial
            continue
        builder = first[3]
        parts = [initial]
        end = first.end()
        while True:
            rest = re.match(rb'\s*(?:\.line [0-9]+\s*)*', data[end:])
            following = pair.match(data, end + rest.end())
            if following is None or following[3] != builder:
                break
            parts.append(decode_literal(following[2]))
            end = following.end()
        yield ''.join(parts)

