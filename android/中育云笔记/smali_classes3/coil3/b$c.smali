.class public interface abstract Lcoil3/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil3/b$c$a;
    }
.end annotation


# static fields
.field public static final a:Lcoil3/b$c$a;

.field public static final b:Lcoil3/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcoil3/b$c$a;->a:Lcoil3/b$c$a;

    .line 2
    .line 3
    sput-object v0, Lcoil3/b$c;->a:Lcoil3/b$c$a;

    .line 4
    .line 5
    new-instance v0, Lk/i;

    .line 6
    .line 7
    invoke-direct {v0}, Lk/i;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcoil3/b$c;->b:Lcoil3/b$c;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(Lw/g;)Lcoil3/b;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/b$c;->b(Lw/g;)Lcoil3/b;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lw/g;)Lcoil3/b;
    .locals 0

    .line 1
    sget-object p0, Lcoil3/b;->b:Lcoil3/b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public abstract c(Lw/g;)Lcoil3/b;
.end method
