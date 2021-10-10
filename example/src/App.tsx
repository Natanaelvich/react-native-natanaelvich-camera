import * as React from 'react';

import { StyleSheet, View, Text } from 'react-native';
import { openPickerImage } from 'react-native-natanaelvich-camera';

export default function App() {
  React.useEffect(() => {
    openPickerImage();
  }, []);

  return (
    <View style={styles.container}>
      <Text>CAMERA</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
