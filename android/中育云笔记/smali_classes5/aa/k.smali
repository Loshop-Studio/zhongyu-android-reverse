.class public final Laa/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lga/d;

.field public final b:Lv9/c;


# direct methods
.method public constructor <init>(Lga/d;Lv9/c;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphControl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Laa/k;->a:Lga/d;

    .line 15
    .line 16
    iput-object p2, p0, Laa/k;->b:Lv9/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/google/protobuf/Any;J)Lz9/e;
    .locals 0

    .line 1
    const-string p2, "data"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Laa/k;->b(Lcom/google/protobuf/Any;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1
.end method

.method public b(Lcom/google/protobuf/Any;)V
    .locals 1

    .line 1
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
