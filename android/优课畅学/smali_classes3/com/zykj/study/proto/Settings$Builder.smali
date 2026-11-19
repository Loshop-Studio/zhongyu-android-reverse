# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/study/proto/Settings$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/study/proto/SettingsOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/proto/Settings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/zykj/study/proto/Settings;",
        "Lcom/zykj/study/proto/Settings$Builder;",
        ">;",
        "Lcom/zykj/study/proto/SettingsOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/study/proto/Settings;->e()Lcom/zykj/study/proto/Settings;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/study/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/proto/Settings$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public clearCachePageIndex()Lcom/zykj/study/proto/Settings$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/study/proto/Settings;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/study/proto/Settings;->a(Lcom/zykj/study/proto/Settings;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearCachePagePositionOffset()Lcom/zykj/study/proto/Settings$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/study/proto/Settings;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/study/proto/Settings;->b(Lcom/zykj/study/proto/Settings;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getCachePageIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/study/proto/Settings;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/proto/Settings;->getCachePageIndex()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getCachePagePositionOffset()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/study/proto/Settings;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/proto/Settings;->getCachePagePositionOffset()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public setCachePageIndex(I)Lcom/zykj/study/proto/Settings$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/study/proto/Settings;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/study/proto/Settings;->c(Lcom/zykj/study/proto/Settings;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setCachePagePositionOffset(F)Lcom/zykj/study/proto/Settings$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/study/proto/Settings;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/study/proto/Settings;->d(Lcom/zykj/study/proto/Settings;F)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
