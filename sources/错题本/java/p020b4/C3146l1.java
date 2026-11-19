package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4371i0;
import com.zykj.board.EzySource$FileSource;
import java.io.IOException;

/* renamed from: b4.l1 */
/* loaded from: classes3.dex */
public final class C3146l1 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4371i0 c4371i0NewBuilder = EzySource$FileSource.newBuilder();
        try {
            c4371i0NewBuilder.m3764h(codedInputStream, extensionRegistryLite);
            return c4371i0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4371i0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4371i0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4371i0NewBuilder.buildPartial());
        }
    }
}
