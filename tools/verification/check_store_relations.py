"""Match every embedded relation definition and each reopened native test pair."""
import argparse
import hashlib
import json
from pathlib import Path
import sys

ROOT=Path(__file__).resolve().parents[2]
sys.path.insert(0,str(ROOT/'tools'))
from objectbox_store import decode


def check(path):
    db=decode(path)
    by_id={e['id']:e for e in db['entities']}
    model=json.loads((ROOT/'reports/apps/中育云笔记/objectbox-model.json').read_text())
    result=[]
    for e in model['entities']:
        owner=by_id[e['identity']['id']]
        assert owner['name']==e['name']
        relations={r['id']:r for r in owner['relations']}
        assert len(relations)==len(e['relations'])
        for declared in e['relations']:
            rid=declared['identity']['id']
            rel=relations[rid]
            assert rel['uid']==declared['identity']['uid']
            target=by_id[rel['target_entity_id']]
            assert target['id']==declared['target']['id'] and target['uid']==declared['target']['uid']
            assert rel['pairs']==[[1,1],[1,2],[2,2]]
            assert {b for a,b in rel['pairs']}.issubset({row['id'] for row in target['rows']})
            result.append({'id':rid,'uid':rel['uid'],'owner':owner['name'],'name':declared['name'],
                           'target':target['name'],'pairs':rel['pairs']})
    assert len(result)==11 and db['relation_pairs']==33 and db['unparsed_relation_keys']==0
    return {'database_sha256':hashlib.sha256(path.read_bytes()).hexdigest(), 'edges':33,
            'matched_forward_reverse_keys':66,'relations':sorted(result,key=lambda r:r['id'])}


if __name__=='__main__':
    parser=argparse.ArgumentParser(description=__doc__);parser.add_argument('database',type=Path)
    print(json.dumps(check(parser.parse_args().database),ensure_ascii=False,indent=2))
