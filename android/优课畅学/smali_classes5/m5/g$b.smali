.class public Lm5/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm5/g;->n(Ljava/lang/String;Lm5/c;)Z
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
    iput-object p1, p0, Lm5/g$b;->b:Lm5/g;

    .line 2
    .line 3
    iput-object p2, p0, Lm5/g$b;->a:Lm5/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm5/g$b;->a:Lm5/c;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v2, "request return error!"

    .line 5
    .line 6
    invoke-interface {v0, v1, v2}, Lm5/c;->a(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
