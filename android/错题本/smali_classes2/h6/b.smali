.class public final synthetic Lh6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:[Lh6/h;

.field public final synthetic b:Lkotlin/jvm/internal/Ref$IntRef;


# direct methods
.method public synthetic constructor <init>([Lh6/h;Lkotlin/jvm/internal/Ref$IntRef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/b;->a:[Lh6/h;

    iput-object p2, p0, Lh6/b;->b:Lkotlin/jvm/internal/Ref$IntRef;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ld6/s;

    .line 2
    .line 3
    check-cast p2, Lh6/f;

    .line 4
    .line 5
    const-string v0, "<unused var>"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p1, "element"

    .line 11
    .line 12
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lh6/b;->b:Lkotlin/jvm/internal/Ref$IntRef;

    .line 16
    .line 17
    iget v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 18
    .line 19
    add-int/lit8 v1, v0, 0x1

    .line 20
    .line 21
    iput v1, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 22
    .line 23
    iget-object p1, p0, Lh6/b;->a:[Lh6/h;

    .line 24
    .line 25
    aput-object p2, p1, v0

    .line 26
    .line 27
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 28
    .line 29
    return-object p1
.end method
