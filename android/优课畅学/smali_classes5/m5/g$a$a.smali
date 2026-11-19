.class public Lm5/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm5/g$a;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lm5/g$a;


# direct methods
.method public constructor <init>(Lm5/g$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm5/g$a$a;->a:Lm5/g$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm5/g$a$a;->a:Lm5/g$a;

    .line 2
    .line 3
    iget-object v1, v0, Lm5/g$a;->a:Lm5/c;

    .line 4
    .line 5
    iget-object v0, v0, Lm5/g$a;->b:Lm5/g;

    .line 6
    .line 7
    invoke-static {v0}, Lm5/g;->i(Lm5/g;)Lm5/d;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v1, v0, v2}, Lm5/c;->b(Lm5/b;Lm5/d;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
