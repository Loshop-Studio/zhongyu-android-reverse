.class public final Lm2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm2/d$a;,
        Lm2/d$c;
    }
.end annotation


# static fields
.field private static f:Lm2/d;

.field private static final g:Lo2/f;

.field public static final h:Lm2/d$c;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm2/c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm2/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final c:Z

.field private final d:Z

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm2/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm2/d$c;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lm2/d;->h:Lm2/d$c;

    sget-object v0, Lm2/d$b;->a:Lm2/d$b;

    invoke-static {v0}, Lo2/g;->a(Lx2/a;)Lo2/f;

    move-result-object v0

    sput-object v0, Lm2/d;->g:Lo2/f;

    return-void
.end method

.method private constructor <init>(Ljava/util/List;ZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lm2/c;",
            ">;ZZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/d;->b:Ljava/util/List;

    iput-boolean p2, p0, Lm2/d;->c:Z

    iput-boolean p3, p0, Lm2/d;->d:Z

    iput-boolean p4, p0, Lm2/d;->e:Z

    .line 2
    new-instance p2, Ln2/a;

    invoke-direct {p2}, Ln2/a;-><init>()V

    invoke-static {p1, p2}, Lkotlin/collections/j;->F(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/j;->M(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lm2/d;->a:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZZZLkotlin/jvm/internal/g;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lm2/d;-><init>(Ljava/util/List;ZZZ)V

    return-void
.end method

.method public static final synthetic a(Lm2/d;)V
    .locals 0

    sput-object p0, Lm2/d;->f:Lm2/d;

    return-void
.end method

.method public static final b()Lm2/d$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lm2/d;->h:Lm2/d$c;

    invoke-virtual {v0}, Lm2/d$c;->a()Lm2/d$a;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Lm2/d;)V
    .locals 1
    .param p0    # Lm2/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sget-object v0, Lm2/d;->h:Lm2/d$c;

    invoke-virtual {v0, p0}, Lm2/d$c;->b(Lm2/d;)V

    return-void
.end method
