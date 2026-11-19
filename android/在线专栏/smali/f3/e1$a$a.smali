.class final Lf3/e1$a$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf3/e1$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Lq2/g$b;",
        "Lf3/e1;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lf3/e1$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf3/e1$a$a;

    invoke-direct {v0}, Lf3/e1$a$a;-><init>()V

    sput-object v0, Lf3/e1$a$a;->a:Lf3/e1$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq2/g$b;)Lf3/e1;
    .locals 1
    .param p1    # Lq2/g$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lf3/e1;

    if-eqz v0, :cond_0

    check-cast p1, Lf3/e1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq2/g$b;

    invoke-virtual {p0, p1}, Lf3/e1$a$a;->a(Lq2/g$b;)Lf3/e1;

    move-result-object p1

    return-object p1
.end method
