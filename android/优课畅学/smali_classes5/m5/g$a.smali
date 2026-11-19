.class public Lm5/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm5/g;->g(Lm5/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lm5/c;

.field public final synthetic b:Lm5/g;


# direct methods
.method public constructor <init>(Lm5/g;Lm5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm5/g$a;->b:Lm5/g;

    .line 2
    .line 3
    iput-object p2, p0, Lm5/g$a;->a:Lm5/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/g$a;->b:Lm5/g;

    .line 2
    .line 3
    new-instance v1, Lm5/g$a$b;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lm5/g$a$b;-><init>(Lm5/g$a;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lm5/g;->j(Lm5/g;Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/g$a;->b:Lm5/g;

    .line 2
    .line 3
    iget-object v1, p0, Lm5/g$a;->a:Lm5/c;

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Lm5/g;->h(Lm5/g;Ljava/lang/String;Lm5/c;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lm5/g$a;->b:Lm5/g;

    .line 12
    .line 13
    new-instance v0, Lm5/g$a$a;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lm5/g$a$a;-><init>(Lm5/g$a;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Lm5/g;->j(Lm5/g;Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
