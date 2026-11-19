.class public final Lj3/s$o;
.super Lj3/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation


# static fields
.field public static final a:Lj3/s$o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj3/s$o;

    .line 2
    .line 3
    invoke-direct {v0}, Lj3/s$o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj3/s$o;->a:Lj3/s$o;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj3/s;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lj3/b0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lr2/w$c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lj3/s$o;->d(Lj3/b0;Lr2/w$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Lj3/b0;Lr2/w$c;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lj3/b0;->e(Lr2/w$c;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method
