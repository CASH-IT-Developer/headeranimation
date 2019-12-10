package com.cashit;

import android.graphics.Path;

class Wave {

    Path path;
    int width;
    int wave;
    float offsetX;
    float offsetY;
    float velocity;
    private float scaleX;
    private float scaleY;



    Wave(int offsetX, int offsetY, int velocity, float scaleX, float scaleY, int w, int h, int wave) {
        this.width = (int) (2 * scaleX * w);
        this.wave = wave;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.velocity = velocity;
        this.path = buildWavePath(width, h);
    }

    public void updateWavePath(int w, int h, int waveHeight) {
        this.wave = (wave > 0) ? wave : waveHeight /2;
        this.width = (int) (2* scaleX * w);
        this.path = buildWavePath(width, h);
    }


    private Path buildWavePath(int width, int height) {
        int DP = Util.dp2px(1);
        if (DP < 1) {
            DP = 1;
        }

        int wave = (int) (scaleY * this.wave);

        Path path = new Path();
        path.moveTo(0, 0);
        path.lineTo(0, height - wave);

        for (int x = DP; x < width; x += DP) {
            path.lineTo(x, height - wave - wave * (float) Math.sin(4.0 * Math.PI * x / width));
        }

        path.lineTo(width, height - wave);
        path.lineTo(width, 0);
        path.close();
        return path;
    }
}
