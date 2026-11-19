.class public abstract Le0/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Ld0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ld0/a;

    .line 2
    .line 3
    const-string v1, "Sender"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ld0/a;-><init>(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Le0/c$a;->a:Ld0/a;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a()Ld0/a;
    .locals 1

    .line 1
    sget-object v0, Le0/c$a;->a:Ld0/a;

    .line 2
    .line 3
    return-object v0
.end method
