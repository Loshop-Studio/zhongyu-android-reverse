.class public final Lz1/b$b$k;
.super La2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;->f(Lx2/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lx2/l;


# direct methods
.method constructor <init>(Lx2/l;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$k;->b:Lx2/l;

    invoke-direct {p0}, La2/c;-><init>()V

    return-void
.end method


# virtual methods
.method public o(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1
    .param p1    # Lcom/zykj/message/server/bean/ServerInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lz1/b$b$k;->b:Lx2/l;

    invoke-interface {v0, p1}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
