.class public final Lnb/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Lhd/a;


# direct methods
.method public constructor <init>(ILjava/lang/String;Lhd/a;)V
    .locals 1

    .line 1
    const-string v0, "displayText"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "clickCallback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lnb/g;->a:I

    .line 15
    .line 16
    iput-object p2, p0, Lnb/g;->b:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p3, p0, Lnb/g;->c:Lhd/a;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Lhd/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lnb/g;->c:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnb/g;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lnb/g;->a:I

    .line 2
    .line 3
    return v0
.end method
