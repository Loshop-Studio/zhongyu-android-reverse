.class public final Lu2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/b$b;,
        Lu2/b$a;
    }
.end annotation


# static fields
.field public static final c:Lu2/b$a;


# instance fields
.field public final a:Lr2/y;

.field public final b:Lr2/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu2/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lu2/b;->c:Lu2/b$a;

    return-void
.end method

.method public constructor <init>(Lr2/y;Lr2/a0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu2/b;->a:Lr2/y;

    .line 5
    .line 6
    iput-object p2, p0, Lu2/b;->b:Lr2/a0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lr2/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/b;->b:Lr2/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lr2/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/b;->a:Lr2/y;

    .line 2
    .line 3
    return-object v0
.end method
