.class public La9/d$c;
.super La9/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic c:La9/d;


# direct methods
.method public constructor <init>(La9/d;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, La9/d$c;->c:La9/d;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, La9/d$a;-><init>(La9/d;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lz8/c;Lz8/c;)I
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, La9/d$a;->a(Lz8/c;Lz8/c;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lz8/c;

    .line 2
    .line 3
    check-cast p2, Lz8/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La9/d$c;->a(Lz8/c;Lz8/c;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
