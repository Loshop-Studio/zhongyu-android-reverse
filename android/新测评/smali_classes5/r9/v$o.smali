.class public final Lr9/v$o;
.super Lr9/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation


# static fields
.field public static final a:Lr9/v$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr9/v$o;

    .line 2
    .line 3
    invoke-direct {v0}, Lr9/v$o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr9/v$o;->a:Lr9/v$o;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr9/v;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lr9/a0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La9/u$c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lr9/v$o;->d(Lr9/a0;La9/u$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Lr9/a0;La9/u$c;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lr9/a0;->e(La9/u$c;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method
