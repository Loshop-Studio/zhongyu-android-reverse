"""Compare the APK's answer-sheet model file, generated schema and CPU inference."""
import hashlib
import importlib.metadata
import json
from pathlib import Path
import sys
from zipfile import ZipFile

import numpy as np
from ai_edge_litert.interpreter import Interpreter, OpResolverType

ROOT=Path(__file__).resolve().parents[2]
sys.path.insert(0,str(ROOT/'tools'))
from tflite_model import describe


def main():
    out=ROOT/'reports/evidence/answer-sheet';out.mkdir(exist_ok=True)
    app=ROOT/'中育apk/新测评.apk'
    with ZipFile(app) as archive:
        raw=archive.read('assets/sel_judge_06.tflite')
    assert raw==(ROOT/'android/新测评/assets/sel_judge_06.tflite').read_bytes()
    model=describe(raw)
    graph,=model['graphs']
    ops=[op['opcode'] for op in graph['operators']]
    assert ops==['CONV_2D','CONV_2D','MAX_POOL_2D','RESHAPE','FULLY_CONNECTED','SOFTMAX']
    source,dest=graph['inputs'][0],graph['outputs'][0]
    by_id={t['index']:t for t in graph['tensors']}
    assert by_id[source]['shape']==[1,28,28,1] and by_id[dest]['shape']==[1,2]
    assert by_id[source]['type']==by_id[dest]['type']=='FLOAT32'
    tensors=[np.zeros((1,28,28,1),np.float32),np.ones((1,28,28,1),np.float32),
             np.eye(28,dtype=np.float32).reshape(1,28,28,1)]
    trials={}
    for label,kind in [('cpu',OpResolverType.BUILTIN_WITHOUT_DEFAULT_DELEGATES),('reference',OpResolverType.BUILTIN_REF)]:
        rt=Interpreter(model_content=raw,experimental_op_resolver_type=kind,num_threads=1)
        rt.allocate_tensors()
        assert rt.get_input_details()[0]['index']==source and rt.get_output_details()[0]['index']==dest
        scores={}
        for name,array in zip(('zero','one','diagonal'),tensors):
            rt.set_tensor(source,array);rt.invoke()
            result=rt.get_tensor(dest).ravel()
            assert np.isfinite(result).all() and abs(result.sum()-1)<1e-5
            scores[name]=list(map(float,result))
        trials[label]=scores
    differences={name:float(np.max(np.abs(np.array(scores)-trials['reference'][name])))
                 for name,scores in trials['cpu'].items()}
    assert max(differences.values())<.02, differences
    assert any(np.max(np.abs(np.array(trials['cpu']['zero'])-row))>.01 for row in trials['cpu'].values())
    (out/'model.json').write_text(json.dumps(model,indent=2)+'\n')
    report={'apk_sha256':hashlib.sha256(app.read_bytes()).hexdigest(),'model_sha256':model['sha256'],
            'host_runtime':'ai-edge-litert '+importlib.metadata.version('ai-edge-litert'),
            'runtime_input':'Synthetic float32 tensors, no camera, sheet or labels supplied',
            'scores':trials,'max_absolute_difference':differences}
    (out/'inference.json').write_text(json.dumps(report,indent=2)+'\n')
    print(json.dumps(report,indent=2))
if __name__=='__main__':main()
