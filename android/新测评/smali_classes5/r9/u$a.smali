.class public final Lr9/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lr9/h;


# direct methods
.method public constructor <init>(Lr9/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/u$a;->a:Lr9/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(La9/z;)Ljava/util/Optional;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/u$a;->a:Lr9/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lr9/h;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La9/z;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr9/u$a;->a(La9/z;)Ljava/util/Optional;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
