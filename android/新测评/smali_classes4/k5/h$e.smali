.class public final Lk5/h$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public a:Lm8/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk5/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk5/h$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm8/a;)Lk5/h$e;
    .locals 0

    .line 1
    invoke-static {p1}, Lo8/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lm8/a;

    .line 6
    .line 7
    iput-object p1, p0, Lk5/h$e;->a:Lm8/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public b()Lk5/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/h$e;->a:Lm8/a;

    .line 2
    .line 3
    const-class v1, Lm8/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lo8/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lk5/h$h;

    .line 9
    .line 10
    iget-object v1, p0, Lk5/h$e;->a:Lm8/a;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lk5/h$h;-><init>(Lm8/a;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
