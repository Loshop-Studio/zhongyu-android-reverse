.class public final Landroid/support/v4/media/j;
.super Landroid/media/browse/MediaBrowser$ConnectionCallback;
.source "SourceFile"


# instance fields
.field public final a:Lo2/a;


# direct methods
.method public constructor <init>(Lo2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ConnectionCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroid/support/v4/media/j;->a:Lo2/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onConnected()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/j;->a:Lo2/a;

    .line 2
    .line 3
    iget-object v0, v0, Lo2/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/support/v4/media/c;

    .line 6
    .line 7
    iget-object v1, v0, Landroid/support/v4/media/c;->mConnectionCallbackInternal:Landroid/support/v4/media/b;

    .line 8
    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    check-cast v1, Landroid/support/v4/media/d;

    .line 12
    .line 13
    iget-object v2, v1, Landroid/support/v4/media/d;->d:Landroid/support/v4/media/a;

    .line 14
    .line 15
    iget-object v3, v1, Landroid/support/v4/media/d;->b:Landroid/media/browse/MediaBrowser;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroid/media/browse/MediaBrowser;->getExtras()Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    const-string v5, "extra_service_version"

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    const-string v5, "extra_messenger"

    .line 32
    .line 33
    invoke-static {v4, v5}, Landroidx/core/app/BundleCompat;->getBinder(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    new-instance v7, Landroid/support/v4/media/h;

    .line 40
    .line 41
    iget-object v8, v1, Landroid/support/v4/media/d;->c:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v7, v6, v6}, Landroid/support/v4/media/h;-><init>(IZ)V

    .line 44
    .line 45
    .line 46
    new-instance v6, Landroid/os/Messenger;

    .line 47
    .line 48
    invoke-direct {v6, v5}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 49
    .line 50
    .line 51
    iput-object v6, v7, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v8, v7, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object v7, v1, Landroid/support/v4/media/d;->f:Landroid/support/v4/media/h;

    .line 56
    .line 57
    new-instance v5, Landroid/os/Messenger;

    .line 58
    .line 59
    invoke-direct {v5, v2}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 60
    .line 61
    .line 62
    iput-object v5, v1, Landroid/support/v4/media/d;->g:Landroid/os/Messenger;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    invoke-direct {v6, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object v6, v2, Landroid/support/v4/media/a;->b:Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    :try_start_0
    iget-object v2, v1, Landroid/support/v4/media/d;->f:Landroid/support/v4/media/h;

    .line 75
    .line 76
    iget-object v5, v1, Landroid/support/v4/media/d;->a:Landroid/content/Context;

    .line 77
    .line 78
    iget-object v6, v1, Landroid/support/v4/media/d;->g:Landroid/os/Messenger;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v7, Landroid/os/Bundle;

    .line 84
    .line 85
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v8, "data_package_name"

    .line 89
    .line 90
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v7, v8, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string v5, "data_root_hints"

    .line 98
    .line 99
    iget-object v8, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v8, Landroid/os/Bundle;

    .line 102
    .line 103
    invoke-virtual {v7, v5, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 104
    .line 105
    .line 106
    const/4 v5, 0x6

    .line 107
    invoke-virtual {v2, v5, v7, v6}, Landroid/support/v4/media/h;->C(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :catch_0
    const-string v2, "MediaBrowserCompat"

    .line 112
    .line 113
    const-string v5, "Remote error registering client messenger."

    .line 114
    .line 115
    invoke-static {v2, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    :cond_1
    :goto_0
    const-string v2, "extra_session_binder"

    .line 119
    .line 120
    invoke-static {v4, v2}, Landroidx/core/app/BundleCompat;->getBinder(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    sget v4, Landroid/support/v4/media/session/b;->c:I

    .line 125
    .line 126
    if-nez v2, :cond_2

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    goto :goto_1

    .line 130
    :cond_2
    const-string v4, "android.support.v4.media.session.IMediaSession"

    .line 131
    .line 132
    invoke-interface {v2, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-eqz v4, :cond_3

    .line 137
    .line 138
    instance-of v5, v4, Landroid/support/v4/media/session/c;

    .line 139
    .line 140
    if-eqz v5, :cond_3

    .line 141
    .line 142
    move-object v2, v4

    .line 143
    check-cast v2, Landroid/support/v4/media/session/c;

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    new-instance v4, Landroid/support/v4/media/session/a;

    .line 147
    .line 148
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object v2, v4, Landroid/support/v4/media/session/a;->c:Landroid/os/IBinder;

    .line 152
    .line 153
    move-object v2, v4

    .line 154
    :goto_1
    if-eqz v2, :cond_4

    .line 155
    .line 156
    invoke-virtual {v3}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static {v3, v2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a(Landroid/os/Parcelable;Landroid/support/v4/media/session/c;)Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iput-object v2, v1, Landroid/support/v4/media/d;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 165
    .line 166
    :cond_4
    :goto_2
    invoke-virtual {v0}, Landroid/support/v4/media/c;->onConnected()V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public final onConnectionFailed()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/j;->a:Lo2/a;

    .line 2
    .line 3
    iget-object v0, v0, Lo2/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/support/v4/media/c;

    .line 6
    .line 7
    iget-object v1, v0, Landroid/support/v4/media/c;->mConnectionCallbackInternal:Landroid/support/v4/media/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/support/v4/media/c;->onConnectionFailed()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onConnectionSuspended()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/j;->a:Lo2/a;

    .line 2
    .line 3
    iget-object v0, v0, Lo2/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/support/v4/media/c;

    .line 6
    .line 7
    iget-object v1, v0, Landroid/support/v4/media/c;->mConnectionCallbackInternal:Landroid/support/v4/media/b;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v1, Landroid/support/v4/media/d;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, v1, Landroid/support/v4/media/d;->f:Landroid/support/v4/media/h;

    .line 15
    .line 16
    iput-object v2, v1, Landroid/support/v4/media/d;->g:Landroid/os/Messenger;

    .line 17
    .line 18
    iput-object v2, v1, Landroid/support/v4/media/d;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 19
    .line 20
    iget-object v1, v1, Landroid/support/v4/media/d;->d:Landroid/support/v4/media/a;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v3, v1, Landroid/support/v4/media/a;->b:Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/media/c;->onConnectionSuspended()V

    .line 33
    .line 34
    .line 35
    return-void
.end method
