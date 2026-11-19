.class public final Lk5/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lk5/h$h;

.field public b:Ll8/g;


# direct methods
.method public constructor <init>(Lk5/h$h;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lk5/h$c;->a:Lk5/h$h;

    return-void
.end method

.method public synthetic constructor <init>(Lk5/h$h;Lk5/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lk5/h$c;-><init>(Lk5/h$h;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ll8/g;)Lj8/b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk5/h$c;->c(Ll8/g;)Lk5/h$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Lk5/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/h$c;->b:Ll8/g;

    .line 2
    .line 3
    const-class v1, Ll8/g;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lo8/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lk5/h$d;

    .line 9
    .line 10
    iget-object v1, p0, Lk5/h$c;->a:Lk5/h$h;

    .line 11
    .line 12
    iget-object v2, p0, Lk5/h$c;->b:Ll8/g;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lk5/h$d;-><init>(Lk5/h$h;Ll8/g;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic build()Lg8/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk5/h$c;->b()Lk5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Ll8/g;)Lk5/h$c;
    .locals 0

    .line 1
    invoke-static {p1}, Lo8/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ll8/g;

    .line 6
    .line 7
    iput-object p1, p0, Lk5/h$c;->b:Ll8/g;

    .line 8
    .line 9
    return-object p0
.end method
