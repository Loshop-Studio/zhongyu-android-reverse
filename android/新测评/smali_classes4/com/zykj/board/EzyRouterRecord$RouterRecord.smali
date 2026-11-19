# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyRouterRecord$RouterRecord;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyRouterRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RouterRecord"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;,
        Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;
    }
.end annotation


# static fields
.field public static final i:Lcom/zykj/board/EzyRouterRecord$RouterRecord;

.field public static final j:Lcom/google/protobuf/Parser;


# instance fields
.field public a:Ljava/util/List;

.field public b:Ljava/util/List;

.field public c:Ljava/util/List;

.field public d:Ljava/util/List;

.field public e:Ljava/util/List;

.field public f:Ljava/util/List;

.field public g:Ljava/util/List;

.field public h:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->i:Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->j:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput-byte v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->h:B

    .line 6
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a:Ljava/util/List;

    .line 7
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->b:Ljava/util/List;

    .line 8
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->c:Ljava/util/List;

    .line 9
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->d:Ljava/util/List;

    .line 10
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->e:Ljava/util/List;

    .line 11
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f:Ljava/util/List;

    .line 12
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->g:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, -0x1

    .line 3
    iput-byte p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->h:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyRouterRecord$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic A()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static F()Lcom/zykj/board/EzyRouterRecord$RouterRecord;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->i:Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public static R()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->i:Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->V()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static U(Ljava/io/InputStream;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->j:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic a(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2200()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$2300()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$2400()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$2600()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic f(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic j(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic m(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic q(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic s(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic t(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic u(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic v(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic w(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic x(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic y()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic z()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method


# virtual methods
.method public B()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public C()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public D()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public E()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public G()Lcom/zykj/board/EzyRouterRecord$RouterRecord;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->i:Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public H()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public I()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public J()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public K()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public L()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public M()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public N()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public O()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public P()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public Q()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public S()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->R()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public T(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyRouterRecord$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public V()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->i:Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;-><init>(Lcom/zykj/board/EzyRouterRecord$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;-><init>(Lcom/zykj/board/EzyRouterRecord$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->D(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_1
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->E()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->E()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->C()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->C()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->Q()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->Q()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    return v2

    .line 62
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->M()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->M()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_5

    .line 75
    .line 76
    return v2

    .line 77
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->I()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->I()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_6

    .line 90
    .line 91
    return v2

    .line 92
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->O()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->O()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_7

    .line 105
    .line 106
    return v2

    .line 107
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->K()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->K()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_8

    .line 120
    .line 121
    return v2

    .line 122
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-nez p1, :cond_9

    .line 135
    .line 136
    return v2

    .line 137
    :cond_9
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->G()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->G()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->j:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v1, v3, :cond_1

    .line 17
    .line 18
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-static {v4, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/2addr v2, v3

    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v1, v0

    .line 36
    :goto_1
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->b:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge v1, v3, :cond_2

    .line 43
    .line 44
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->b:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 51
    .line 52
    const/4 v4, 0x2

    .line 53
    invoke-static {v4, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/2addr v2, v3

    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move v1, v0

    .line 62
    :goto_2
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->c:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-ge v1, v3, :cond_3

    .line 69
    .line 70
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->c:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 77
    .line 78
    const/4 v4, 0x3

    .line 79
    invoke-static {v4, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    add-int/2addr v2, v3

    .line 84
    add-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    move v1, v0

    .line 88
    :goto_3
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->d:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-ge v1, v3, :cond_4

    .line 95
    .line 96
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->d:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 103
    .line 104
    const/4 v4, 0x4

    .line 105
    invoke-static {v4, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    add-int/2addr v2, v3

    .line 110
    add-int/lit8 v1, v1, 0x1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    move v1, v0

    .line 114
    :goto_4
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->e:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-ge v1, v3, :cond_5

    .line 121
    .line 122
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->e:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 129
    .line 130
    const/4 v4, 0x5

    .line 131
    invoke-static {v4, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    add-int/2addr v2, v3

    .line 136
    add-int/lit8 v1, v1, 0x1

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_5
    move v1, v0

    .line 140
    :goto_5
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-ge v1, v3, :cond_6

    .line 147
    .line 148
    iget-object v3, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 155
    .line 156
    const/4 v4, 0x6

    .line 157
    invoke-static {v4, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    add-int/2addr v2, v3

    .line 162
    add-int/lit8 v1, v1, 0x1

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_6
    :goto_6
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->g:Ljava/util/List;

    .line 166
    .line 167
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-ge v0, v1, :cond_7

    .line 172
    .line 173
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->g:Ljava/util/List;

    .line 174
    .line 175
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 180
    .line 181
    const/4 v3, 0x7

    .line 182
    invoke-static {v3, v1}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    add-int/2addr v2, v1

    .line 187
    add-int/lit8 v0, v0, 0x1

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    add-int/2addr v2, v0

    .line 199
    iput v2, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 200
    .line 201
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x30b

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->D()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_1

    .line 22
    .line 23
    mul-int/lit8 v1, v1, 0x25

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    mul-int/lit8 v1, v1, 0x35

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->E()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v1, v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->B()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lez v0, :cond_2

    .line 43
    .line 44
    mul-int/lit8 v1, v1, 0x25

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    mul-int/lit8 v1, v1, 0x35

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->C()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v1, v0

    .line 59
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->P()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-lez v0, :cond_3

    .line 64
    .line 65
    mul-int/lit8 v1, v1, 0x25

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x3

    .line 68
    .line 69
    mul-int/lit8 v1, v1, 0x35

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->Q()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    add-int/2addr v1, v0

    .line 80
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->L()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-lez v0, :cond_4

    .line 85
    .line 86
    mul-int/lit8 v1, v1, 0x25

    .line 87
    .line 88
    add-int/lit8 v1, v1, 0x4

    .line 89
    .line 90
    mul-int/lit8 v1, v1, 0x35

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->M()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    add-int/2addr v1, v0

    .line 101
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->H()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-lez v0, :cond_5

    .line 106
    .line 107
    mul-int/lit8 v1, v1, 0x25

    .line 108
    .line 109
    add-int/lit8 v1, v1, 0x5

    .line 110
    .line 111
    mul-int/lit8 v1, v1, 0x35

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->I()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    add-int/2addr v1, v0

    .line 122
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->N()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-lez v0, :cond_6

    .line 127
    .line 128
    mul-int/lit8 v1, v1, 0x25

    .line 129
    .line 130
    add-int/lit8 v1, v1, 0x6

    .line 131
    .line 132
    mul-int/lit8 v1, v1, 0x35

    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->O()Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    add-int/2addr v1, v0

    .line 143
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->J()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-lez v0, :cond_7

    .line 148
    .line 149
    mul-int/lit8 v1, v1, 0x25

    .line 150
    .line 151
    add-int/lit8 v1, v1, 0x7

    .line 152
    .line 153
    mul-int/lit8 v1, v1, 0x35

    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->K()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    add-int/2addr v1, v0

    .line 164
    :cond_7
    mul-int/lit8 v1, v1, 0x1d

    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    add-int/2addr v1, v0

    .line 175
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 176
    .line 177
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->h:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    iput-byte v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->h:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->S()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->T(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->S()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->V()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->V()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v0

    .line 27
    :goto_1
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->b:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ge v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->b:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v1, v0

    .line 51
    :goto_2
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->c:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-ge v1, v2, :cond_2

    .line 58
    .line 59
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->c:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 66
    .line 67
    const/4 v3, 0x3

    .line 68
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move v1, v0

    .line 75
    :goto_3
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->d:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ge v1, v2, :cond_3

    .line 82
    .line 83
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->d:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 90
    .line 91
    const/4 v3, 0x4

    .line 92
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    move v1, v0

    .line 99
    :goto_4
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->e:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-ge v1, v2, :cond_4

    .line 106
    .line 107
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->e:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 114
    .line 115
    const/4 v3, 0x5

    .line 116
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_4
    move v1, v0

    .line 123
    :goto_5
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-ge v1, v2, :cond_5

    .line 130
    .line 131
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f:Ljava/util/List;

    .line 132
    .line 133
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 138
    .line 139
    const/4 v3, 0x6

    .line 140
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 141
    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_5
    :goto_6
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->g:Ljava/util/List;

    .line 147
    .line 148
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-ge v0, v1, :cond_6

    .line 153
    .line 154
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->g:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 161
    .line 162
    const/4 v2, 0x7

    .line 163
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v0, v0, 0x1

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method
