.class final Li3/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf3/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:Li3/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li3/i<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:J

.field public final c:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lq2/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li3/i;JLjava/lang/Object;Lq2/d;)V
    .locals 0
    .param p1    # Li3/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li3/i<",
            "*>;J",
            "Ljava/lang/Object;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li3/i$a;->a:Li3/i;

    .line 3
    iput-wide p2, p0, Li3/i$a;->b:J

    .line 4
    iput-object p4, p0, Li3/i$a;->c:Ljava/lang/Object;

    .line 5
    iput-object p5, p0, Li3/i$a;->d:Lq2/d;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Li3/i$a;->a:Li3/i;

    invoke-static {v0, p0}, Li3/i;->l(Li3/i;Li3/i$a;)V

    return-void
.end method
