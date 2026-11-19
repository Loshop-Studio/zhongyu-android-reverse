.class final Li2/a$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li2/a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Lx2/l<",
        "-",
        "Ljava/lang/String;",
        "+",
        "Lo2/r;",
        ">;",
        "Lo2/r;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Li2/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/a$a;

    invoke-direct {v0}, Li2/a$a;-><init>()V

    sput-object v0, Li2/a$a;->a:Li2/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lx2/l;)V
    .locals 1
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    invoke-interface {p1, v0}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx2/l;

    invoke-virtual {p0, p1}, Li2/a$a;->a(Lx2/l;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
