.class public final Li5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li5/b$a;,
        Li5/b$b;
    }
.end annotation


# static fields
.field public static final c:Li5/b$a;


# instance fields
.field public final a:Lf5/b0;

.field public final b:Lf5/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li5/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li5/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li5/b;->c:Li5/b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lf5/b0;Lf5/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li5/b;->a:Lf5/b0;

    .line 5
    .line 6
    iput-object p2, p0, Li5/b;->b:Lf5/d0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lf5/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Li5/b;->b:Lf5/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lf5/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Li5/b;->a:Lf5/b0;

    .line 2
    .line 3
    return-object v0
.end method
