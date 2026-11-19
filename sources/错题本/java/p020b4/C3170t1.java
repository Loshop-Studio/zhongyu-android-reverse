package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4395u0;
import com.zykj.board.EzySource$TouchSource;
import java.io.IOException;

/* renamed from: b4.t1 */
/* loaded from: classes3.dex */
public final class C3170t1 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4395u0 c4395u0NewBuilder = EzySource$TouchSource.newBuilder();
        try {
            c4395u0NewBuilder.m3846h(codedInputStream, extensionRegistryLite);
            return c4395u0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4395u0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4395u0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4395u0NewBuilder.buildPartial());
        }
    }
}
