.class public abstract Lz2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/c$a;
    }
.end annotation


# static fields
.field public static final a:Lz2/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final b:Lz2/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz2/c$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lz2/c;->a:Lz2/c$a;

    sget-object v0, Ls2/b;->a:Ls2/a;

    invoke-virtual {v0}, Ls2/a;->b()Lz2/c;

    move-result-object v0

    sput-object v0, Lz2/c;->b:Lz2/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lz2/c;
    .locals 1

    sget-object v0, Lz2/c;->b:Lz2/c;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method
