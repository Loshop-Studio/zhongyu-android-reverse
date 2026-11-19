.class final Lm2/d$b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/a<",
        "Ln2/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm2/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm2/d$b;

    invoke-direct {v0}, Lm2/d$b;-><init>()V

    sput-object v0, Lm2/d$b;->a:Lm2/d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ln2/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ln2/b;

    invoke-direct {v0}, Ln2/b;-><init>()V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm2/d$b;->a()Ln2/b;

    move-result-object v0

    return-object v0
.end method
