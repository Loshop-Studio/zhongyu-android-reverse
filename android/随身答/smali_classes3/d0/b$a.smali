.class public final Ld0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Ld0/d;Ly/j;)Ld0/c;
    .locals 1

    .line 1
    new-instance v0, Ld0/b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Ld0/b;-><init>(Ld0/d;Ly/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
