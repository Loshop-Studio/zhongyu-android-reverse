.class public Lm5/g$c;
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

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lm5/g;


# direct methods
.method public constructor <init>(Lm5/g;Lm5/c;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm5/g$c;->d:Lm5/g;

    .line 2
    .line 3
    iput-object p2, p0, Lm5/g$c;->a:Lm5/c;

    .line 4
    .line 5
    iput p3, p0, Lm5/g$c;->b:I

    .line 6
    .line 7
    iput-object p4, p0, Lm5/g$c;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm5/g$c;->a:Lm5/c;

    .line 2
    .line 3
    iget v1, p0, Lm5/g$c;->b:I

    .line 4
    .line 5
    iget-object v2, p0, Lm5/g$c;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Lm5/c;->a(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
