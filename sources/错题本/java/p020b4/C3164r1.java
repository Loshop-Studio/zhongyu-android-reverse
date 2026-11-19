package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4389r0;
import com.zykj.board.EzySource$TextSource;
import java.io.IOException;

/* renamed from: b4.r1 */
/* loaded from: classes3.dex */
public final class C3164r1 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4389r0 c4389r0NewBuilder = EzySource$TextSource.newBuilder();
        try {
            c4389r0NewBuilder.m3826h(codedInputStream, extensionRegistryLite);
            return c4389r0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4389r0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4389r0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4389r0NewBuilder.buildPartial());
        }
    }
}
